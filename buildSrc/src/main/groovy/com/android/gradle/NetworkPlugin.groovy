package com.android.gradle

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response
import okio.BufferedSink
import okio.Okio
import okio.Sink
import org.gradle.api.Plugin
import org.gradle.api.Project

class NetworkPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
//        createJson()
//        createApiRequest()
//        createRequestAndResponse()
//        project.task("hello").doLast {
//            createJson()
//        }
    }

    class TestBean{
        int rand
        String key
        String date
    }

    void createJson() {
        System.out.println("==========jackie========")
        OkHttpClient client = new OkHttpClient();
        MediaType JSON = MediaType.parse("application/json; charset=utf-8")
        TestBean testBean = new TestBean()
        testBean.setDate("2020-2-28")
        testBean.setRand(0)
        testBean.setKey("d092d0b34915a4d3024630f13b4b7dc4")
        Gson gson = new Gson()
        String testJson = gson.toJson(testBean)
        RequestBody body = RequestBody.create(JSON,testJson)
        Request request = new Request.Builder()
                .url("http://api.tianapi.com/txapi/everyday/index")
                .post(body)
                .build()
        Call mCall = client.newCall(request)
        mCall.enqueue(new Callback() {

            @Override
            void onFailure(Call call, IOException e) {
                System.out.println("========="+e.printStackTrace())
            }

            @Override
            void onResponse(Call call, Response response) throws IOException {
                String res=response.body().string();
                System.out.print("====response==="+res)
//                Sink sink = null;
//                BufferedSink bufferedSink = null;
//                try {
//                    String mSDCardPath = Environment.getExternalStorageDirectory().getAbsolutePath();
////SD卡路径
//                    //String appPath= getApplicationContext().getFilesDir().getAbsolutePath();//此APP的files路径
//                    File dest = new File(appPath, url.substring(url.lastIndexOf("/") + 1));
//                    sink = Okio.sink(dest);
//                    bufferedSink = Okio.buffer(sink);
//                    bufferedSink.writeAll(response.body().source());
//
//                    bufferedSink.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    System.out.println("download failed");
//                } finally {
//                    if (bufferedSink != null) {
//                        bufferedSink.close();
//                    }
//                }

//                String res=response.body().string();
//                System.out.print("====response==="+res)
//                //                //非主线程
//                InputStream is = null;
//                byte[] buf = new byte[2048];
//                int len = 0;
//                FileOutputStream fos = null;
//                // 储存下载文件的目录
//                String savePath = isExistDir(saveDir);
//                try {
//                    //获取响应的字节流
//                    is = response.body().byteStream();
//                    //文件的总大小
//                    long total = response.body().contentLength();
//                    File file = new File(savePath);
//                    fos = new FileOutputStream(file);
//                    long sum = 0;
//                    //循环读取输入流
//                    while ((len = is.read(buf)) != -1) {
//                        fos.write(buf, 0, len);
//                        sum += len;
//                    }
//                    fos.flush();
//                    // 下载完成
////                    if(listener != null){
////                        listener.onDownloadSuccess();
////                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace()
////                    if(listener != null){
////                        listener.onDownloadFailed();
////                    }
//
//                }
            }
        })
    }


    Map<String, String> map

    void createApiRequest() {
        println("=========createApiRequest======")
        //print("create file")
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("package com.jackie.createapidemo.api.json;" +
                "import com.jackie.createapidemo.api.model.*\n" +
                "import io.reactivex.Observable\n" +
                "import retrofit2.Response\n" +
                "import retrofit2.http.*\n\n");
        sb.append("interface ApiRequest {\n\n");


        String json = readToString(new File(
                "/Users/jackie/Desktop/WorkPlace/AndroidWorkPlace/CreateApiDemo/Json/JsonString.txt"), "UTF-8");

        JsonParser parser = new JsonParser();
        JsonObject jsonObject = (JsonObject) parser.parse(json);

        //services
        JsonArray servicesArray = jsonObject.getAsJsonArray("services");

        for (int h = 0; h < servicesArray.size(); h++) {

            JsonObject interfacebject = servicesArray.get(h).getAsJsonObject();

            String outName = interfacebject.get("name").getAsString();

            String newOutName = outName.substring(0, 1).toLowerCase() + outName.substring(1);
            //System.out.println(newOutName);
            //optations:[{},{}]
            JsonArray optationsArray = interfacebject.getAsJsonArray("operations");
            for (int j = 0; j < optationsArray.size(); j++) {

                JsonObject jsInterface = optationsArray.get(j).getAsJsonObject();

                String tempName = jsInterface.get("name").getAsString();

                String name = newOutName.concat(tempName.substring(0, 1).toUpperCase() + tempName.substring(1));

                String method = jsInterface.get("method").getAsString();

                String path = jsInterface.get("path").getAsString();

                JsonArray pathArray = jsInterface.get("pathParams").getAsJsonArray();


                String responseType = jsInterface.get("responseType").getAsString().replace("void", "Void");

                String requestType = String.valueOf(jsInterface.get("requestType")).replace("\"", "");

                //@方法类型("url") @POST("product/{code}/review")
                String requestMethod = String.format("\t@%s(\"", method);
                sb.append(requestMethod);

                //移除首个/,同时规范一下（）中的内容，比如"account/reorder-v2/{id}"
                String[] pathArr = path.split("/");
                StringBuilder pathSb = new StringBuilder();
                if (pathArr.length > 0) {
                    for (int i = 0; i < pathArr.length; i++) {
                        if (pathArr[i].equals("")) {
                            continue;
                        }
                        if (pathArr[i].contains(":")) {
                            String str = pathArr[i].replace(":", "{");

                            pathSb.append(str);
                            pathSb.append("}");
                            if (i != pathArr.length - 1) {
                                pathSb.append("/");
                            }
                            continue;
                        }
                        pathSb.append(pathArr[i]);
                        if (i != pathArr.length - 1) {
                            pathSb.append("/");
                        }
                    }
                }
                System.out.println(pathSb.toString());
                sb.append(pathSb.toString());
                sb.append("\")\n\t");

//        fun addReview(@Path("code") code: String?,
//                      @Body body: HashMap<String, Any?>): Observable<Response<Void>>
                //如果路径中含有参数，进行拼接 @Path("code") code: String?,
                StringBuilder paramSb = new StringBuilder();
                if (pathArray != null && pathArray.size() > 0) {
                    for (int i = 0; i < pathArray.size(); i++) {
                        JsonObject paramObject = pathArray.get(i).getAsJsonObject();
                        String paramName = paramObject.get("name").getAsString();
                        String paramType = paramObject.get("type").getAsString().replace("string", "String");
                        String pathString = String.format("@Path(\"%1s\") %2s: %3s?", paramName, paramName, paramType);
                        paramSb.append(pathString);
                        if (i != pathArray.size() - 1) {
                            paramSb.append(",");
                        }
                    }
                }

                //请求Body  hasMap或者具体的类   @Body body: HashMap<String, Any?>): Observable<Response<Void>>
                StringBuilder bodySb = new StringBuilder();
                if (!requestType.equals("null")) {
                    bodySb.append("@Body body: ");
                    bodySb.append(requestType);
                }
                if (pathArray != null && pathArray.size() != 0 && !requestType.equals("null")) {
                    paramSb.append(",");
                }
                //返回类型
                String reponseStr = String.format("): Observable<Response<%s>>", responseType);
                bodySb.append(reponseStr);

                String str = String.format("fun %1s(%2s%3s ", name, paramSb.toString(), bodySb.toString()).replace("(  ", "(");
                sb.append(str);
                sb.append("\n\n");

            }

        }

        sb.append("\n}");

        writeString2File(sb.toString(), new File(
                "/Users/jackie/Desktop/WorkPlace/AndroidWorkPlace/CreateApiDemo/app/src/main/java/com/jackie/createapidemo/api"
                        + File.separator + "json" + File.separator + "ApiRequest.kt"));


        //writeString2File(javaBeanStr,new File("/Test.java"));

    }

    void createRequestAndResponse() {


        String json = readToString(new File(
                "/Users/jackie/Desktop/WorkPlace/AndroidWorkPlace/CreateApiDemo/Json/JsonString.txt"), "UTF-8");
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = (JsonObject) parser.parse(json);
        //services
        JsonArray servicesArray = jsonObject.getAsJsonArray("types");

        map = new HashMap<>();
        //先获取所有的enum类名
        for (int m = 0; m < servicesArray.size(); m++) {

            JsonObject object = servicesArray.get(m).getAsJsonObject();

            String className = object.get("name").getAsString().replace('$', "");

            String type = object.get("type").getAsString();

            if (type.equals("enum")) {
                map.put(className, "enum");
            }
        }

        for (int j = 0; j < servicesArray.size(); j++) {
            JsonObject object = servicesArray.get(j).getAsJsonObject();

            String className = object.get("name").getAsString().replace('$', '');

            String type = object.get("type").getAsString();

            if (type.equals("enum")) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n");
                sb.append("package com.jackie.createapidemo.api.model.enum\n\n");
                sb.append("enum class ");
                sb.append(className);
                sb.append("(val value:String){\n\t");

                String classJson = object
                        .get("definition")
                        .getAsString()
                        .replace("{", "")
                        .replace("}", "");

                String[] fieldArray = classJson.split(",");

                StringBuilder fieldSb = new StringBuilder();
                fieldSb.append(sb.toString());
                for (int i = 0; i < fieldArray.length; i++) {
                    if (fieldArray[i].equals(" ") || fieldArray[i].equals("")) {
                        continue;
                    }
                    String[] detailArray = fieldArray[i].split("=");
                    fieldSb.append(detailArray[0].replace(" ", ""));
                    fieldSb.append("(\"");
                    fieldSb.append(detailArray[1].replace("\"", "").replace(" ", ""));
                    fieldSb.append("\")");
                    if (i != fieldArray.length - 2) {
                        fieldSb.append(",");
                    }
                }
                fieldSb.append("\n}");

                writeString2File(fieldSb.toString(), new File(
                        "/Users/jackie/Desktop/WorkPlace/AndroidWorkPlace/CreateApiDemo/app/src/main/java/com/jackie/createapidemo/api/model"
                                + File.separator + "enum" + File.separator + className + ".kt"));

                continue;
            }


            StringBuilder sb = new StringBuilder();
            sb.append("package com.jackie.createapidemo.api.model\n\n");

            String classJson = object
                    .get("definition")
                    .getAsString()
                    .replace("{", "")
                    .replace("}", "");

            String[] fieldArray = classJson.split(";");

            StringBuilder fieldSb = new StringBuilder();
            //fieldSb.append(sb.toString());
            for (int i = 0; i < fieldArray.length; i++) {
                if (fieldArray[i].equals(" ") || fieldArray[i].equals("")) {
                    continue;
                }
                String[] detailArray = fieldArray[i].replace(" | null", "").replace('$', '').split(":");
                fieldSb.append("\n\tval");
                fieldSb.append(detailArray[0]);
                fieldSb.append(":");

                //String fieldType = detailArray[1].replace("string", "String");

                String fieldType = detailArray[1]
                        .replace("string", "String")
                        .replace("boolean", "Boolean")
                        .replace("number", "Double");

                String importValue = getImportValue(fieldType, sb.toString());
                if (!importValue.equals("")) {
                    sb.append(importValue);
                    sb.append("\n");
                }

                if (fieldType.contains("[]")) {
                    fieldType = String.format("List<%s>", fieldType.replace("[]", "").replace(" ", ""));
                }
                fieldSb.append(fieldType);
                fieldSb.append("?");
                if (i != fieldArray.length - 2) {
                    fieldSb.append(",");
                }
            }

            sb.append("\ndata class ");
            sb.append(className);
            sb.append("(\n");

            sb.append(fieldSb.toString());
            sb.append("\n)");

            //fieldSb.append("\n)");

//        data class LoginModel(
//                @SerializedName("first_name")
//                        val firstName: String?,
//                @SerializedName("last_name")
//                        val lastName: String?,
//                @SerializedName("email")
//                        val email: String?,
//                @SerializedName("intercom_user_hash")
//                        val intercomUserHash: String?,
//                @SerializedName("avatar_image_url")
//                        val iconUrl: String?,
//                @SerializedName("birth_date")
//                        val birthday: String?,
//                @SerializedName("phone")
//                        val phone: String?,
//                @SerializedName("enable_update_birth_date")
//                        val enableUpdateBirthday: Boolean?)

            writeString2File(sb.toString(), new File(
                    "/Users/jackie/Desktop/WorkPlace/AndroidWorkPlace/CreateApiDemo/app/src/main/java/com/jackie/createapidemo/api"
                            + File.separator + "model" + File.separator + className + ".kt"));

        }
    }

    private String getImportValue(String type, String alreadyImportValue) {
        type = type.replace(" ", "").replace("[]", "");
        String dateImportValue = "import java.util.*";
        if (type.equals("Date") && !alreadyImportValue.contains(dateImportValue)) {
            return dateImportValue;
        }
        String typeImportVlaue = "import com.jackie.createapidemo.api.model.enum." + type;
        if (map.containsKey(type) && !alreadyImportValue.contains(typeImportVlaue)) {
            return typeImportVlaue;
        }
        return "";
    }

/**
 * 将字符串写入文件
 */
    private static void writeString2File(String str, File file) {
        BufferedWriter writer = null;
        File parentFile = file.getParentFile();
        try {
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }

            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file), "UTF-8"));
            writer.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                writer = null;
                e.printStackTrace();
            }
        }
    }

/**
 * 根据指定编码格式将文件读取为字符串
 */
    public static String readToString(File file, String charSet) {
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try {
            FileInputStream inputStream = new FileInputStream(file);
            inputStream.read(filecontent);
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(filecontent, charSet);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
