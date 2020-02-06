package com.jackie.createapidemo;

import java.util.List;

/**
 * Description:
 *
 * @author feifei5292190@gmail.com
 * @date 2020-01-20
 */
public class TestHome {

    /**
     * top_navs : [{"name":"FOOD","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/small/cms/5db9d50c-e3c5-4ca9-b14c-6733e1378ca0.png","action_url":"ybapp://search?nav=food"},{"name":"PANTRY","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/small/cms/7119760c-a75e-4c96-9357-6d700787f397.jpg","action_url":"ybapp://search?nav=pantry"},{"name":"BAKING","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/small/cms/8f59825c-4bd9-4ec6-bb3c-ca7d7637b0e3.jpg","action_url":"ybapp://search?nav=baking"},{"name":"SNACKS","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/small/cms/5a67a16a-32e0-4308-b62a-7fa532174812.jpg","action_url":"ybapp://search?nav=snacks"},{"name":"SWEETS","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/small/cms/f8eff110-cb81-4cd0-b2e8-001f4a7583bc.jpg","action_url":"ybapp://search?nav=sweets"},{"name":"ICEY TEST","image_url":null,"action_url":"ybapp://search?nav=iceytest"},{"name":"PASTA & GRAINS","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/small/cms/62106b6d-eee6-473c-b105-dfb2477f9825.jpg","action_url":"ybapp://search?nav=pastagrains"},{"name":"BEVERAGES","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/small/cms/e3a97f97-529f-4255-be3e-82fd821ed2b5.jpg","action_url":"ybapp://search?nav=beverages"},{"name":"ICEY TESSS","image_url":null,"action_url":"ybapp://search?nav=iceytesss"},{"name":"BACK IN STOCK","image_url":null,"action_url":"ybapp://search?nav=backinstock"},{"name":"TEST123","image_url":null,"action_url":"ybapp://search?nav=test"},{"name":"WASIF","image_url":null,"action_url":"ybapp://search?nav=wasif"},{"name":"EDENTEST","image_url":null,"action_url":"ybapp://search?nav=edentest"}]
     * top_banners : [{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/38f1e3d8-d4a3-4ca3-965f-02e41b468ccd.png","action_url":"ybapp://all-brands","description":null,"title":"New"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/588ba391-550b-45a4-b7a5-21c564313c33.jpg","action_url":"ybapp://search#tag=popular","description":"","title":"test \"#tag=popular\""},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/89119b88-783c-4572-9519-f440364bad6e.jpg","action_url":"ybapp://search#brand=A L'Olivier","description":"test","title":"Test \"#brand=A L'Olivier\""},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/bc09332d-e364-40b1-986e-f7fe9f33b17a.jpg","action_url":"ybapp://search?keyword=R-JP-102","description":"Sherry test","title":"SherryCherry"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/ef6b75df-4ebe-4ae0-b116-90fca62aceea.jpg","action_url":"ybapp://external?url=https://www.baidu.com","description":"test","title":"test external url"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/99bfbdc9-e6b7-4379-94aa-63151f57cf4a.png","action_url":"ybapp://external?url=https://www.wenjuan.com/?utm_source=baidu-ss&plan=EML3DZGN51&device=wap&renqun_youhua=184523&bd_vid=10854572283176192037","description":"test","title":"test external url[paramters]"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/80cd3b82-1173-4526-bb5f-c375a1b536ca.jpg","action_url":"ybapp://freebie","description":"test","title":"Freebie"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/e87f151d-75cf-49e3-b7c4-d94dc72a8144.jpg","action_url":"ybapp://searssch?tag22=new","description":"test","title":"test invalid url"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/ad5a4aa5-9e65-4d05-a6b9-f8df9c05932b.jpg","action_url":"ybapp://external?url=htss://www.baidu.com","description":"test","title":"test invalid url external"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/2aac0530-15bb-4590-a0b9-7083dc09073b.png","action_url":"ybapp://search#nav=food-breakfast","description":"334","title":"Test \"# nav= food-breakfast\""},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/f6946e80-144f-4d28-b602-9066ea028d8a.jpg","action_url":"ybapp://search?nav=food-bread-brioche","description":"test","title":"Brioche"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/60c862ba-41b6-4d59-ac7b-1480b4d7aaa4.jpg","action_url":"ybapp://search?region=japan","description":"test","title":"Japan"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/2fe5f73a-e865-4aba-b133-4320687bd5da.jpg","action_url":"ybapp://search?brand=A L'Olivier","description":"Test description","title":"A L'Olivier"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/eaab8507-2515-4cc8-9ab2-27dba3a7b6b1.gif","action_url":"ybapp://search?price=10~11","description":"","title":"price=10~11"}]
     * last_order : null
     * view_all_most_viewed_products_action_url : null
     * most_viewed_products : [{"code":"Icey-0723-01","brand":"STONEWALL KITCHEN","name":"test sync","region":"ITALY","flavors_count":4,"sizes_count":4,"review_ratings":null,"in_stock":true,"new_product":true,"variant":{"sku":"sync-0723-01","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/Icey-0723-01/0-5d6a8483e4.jpeg","price":8,"msrp":9,"flavor":"1","size":"M","weight":"3","qty":-13,"favorite":false,"buy_limit_qty":99,"deleted":false},"available":true},{"code":"YB-2","brand":"APIDIS","name":"Taiwanese Dry Noodles Sesame Flavor Kit by Hon's icey","region":"TAIWAN","flavors_count":11,"sizes_count":11,"review_ratings":null,"in_stock":true,"new_product":true,"variant":{"sku":"TW-131","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-2/0-926547e43a.jpeg","price":60,"msrp":70,"flavor":"Apple","size":"0","weight":"10","qty":6,"favorite":false,"buy_limit_qty":6,"deleted":false},"available":true},{"code":"YB-6332","brand":"STONEWALL KITCHEN","name":"lays stax ajax testtestst tttetttttttttttt ttttttttttesttestt tttttttttttttttttetexstset 122 3345t 6","region":"ITALY","flavors_count":4,"sizes_count":4,"review_ratings":null,"in_stock":true,"new_product":true,"variant":{"sku":"image-01","image_url":null,"price":7,"msrp":null,"flavor":"sweet","size":"M","weight":"1","qty":0,"favorite":false,"buy_limit_qty":99,"deleted":false},"available":true},{"code":"YB-6367","brand":null,"name":null,"region":"GERMANY","flavors_count":0,"sizes_count":3,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"icey-rate-01","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-6367/0-b48cad80ba.jpeg","price":58.99,"msrp":null,"flavor":null,"size":"1","weight":null,"qty":40,"favorite":false,"buy_limit_qty":40,"deleted":false},"available":true},{"code":"YB-6141","brand":"SCHLUNDER","name":"Cappuccino Liqueur Cake","region":"GERMANY","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"DE-122","image_url":null,"price":6.95,"msrp":null,"flavor":null,"size":null,"weight":" 14 oz (400 g)","qty":-5,"favorite":false,"buy_limit_qty":99,"deleted":false},"available":true},{"code":"YB-6327","brand":"ALBA","name":"test delete","region":"JAPAN","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":true,"variant":{"sku":"delete-07","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-6327/0-2d896a059b.jpeg","price":5,"msrp":null,"flavor":null,"size":null,"weight":"6","qty":8,"favorite":false,"buy_limit_qty":8,"deleted":false},"available":true},{"code":"YB-3861","brand":"LA REINESE","name":"Norma Eggplant Tomato Sauce","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"IT-632","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-3861/0-8839d7ebf3.jpeg","price":9.95,"msrp":null,"flavor":null,"size":null,"weight":" 12.3 oz. (350g)","qty":4,"favorite":false,"buy_limit_qty":4,"deleted":false},"available":true},{"code":"pb-r-icey-002","brand":"STONEWALL KITCHEN","name":"test pr2","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":true,"variant":{"sku":"pr-002","image_url":null,"price":9,"msrp":10,"flavor":null,"size":null,"weight":"4","qty":-20,"favorite":false,"buy_limit_qty":99,"deleted":false},"available":true},{"code":"YB-667","brand":"ROWNTREE'S","name":"Fruit Pastilles","region":null,"flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"UK-151","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-667/0-a6c3eba39a.jpeg","price":1.75,"msrp":null,"flavor":null,"size":null,"weight":"1.8 oz (53 g)","qty":5,"favorite":false,"buy_limit_qty":5,"deleted":false},"available":true},{"code":"YB-124","brand":"VIGNERI","name":"YB","region":"ARTISANAL USA","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":true,"variant":{"sku":"US-611","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-124/0-c267aea46d.jpeg","price":29.95,"msrp":null,"flavor":null,"size":null,"weight":"11","qty":11,"favorite":false,"buy_limit_qty":11,"deleted":false},"available":true},{"code":"YB-5877","brand":"FRANCINE","name":"Buckwheat Crepe Mix","region":"FRANCE","flavors_count":0,"sizes_count":2,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"FR-152","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-5877/0-c9f35a0c1f.jpeg","price":4.85,"msrp":null,"flavor":null,"size":"M","weight":" 15.5 oz","qty":8,"favorite":false,"buy_limit_qty":8,"deleted":false},"available":true},{"code":"YB-4071","brand":"JACQUET","name":"Plain French Crepes 10","region":"FRANCE","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"FR-616","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-4071/0-97a03d1453.jpeg","price":4.95,"msrp":null,"flavor":null,"size":null,"weight":".5 oz. (300g) ","qty":20,"favorite":false,"buy_limit_qty":20,"deleted":false},"available":true},{"code":"YB-3985","brand":"FRANCINE","name":"Organic French Wheat Flour","region":"FRANCE","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"FR-652","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-3985/0-d0d17244e4.jpeg","price":4.95,"msrp":null,"flavor":null,"size":null,"weight":" 2.2 lbs. (1kg)","qty":391,"favorite":false,"buy_limit_qty":99,"deleted":false},"available":true},{"code":"YB-586","brand":"A L'OLIVIER","name":"Lemon and Grapefruit Vinegar","region":"FRANCE","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"FR-1022","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-586/0-cfbfa937ef.jpeg","price":14.69,"msrp":null,"flavor":null,"size":null,"weight":"6.7 fl oz (200 ml)","qty":31,"favorite":false,"buy_limit_qty":31,"deleted":false},"available":true},{"code":"YB-6420","brand":null,"name":null,"region":null,"flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"bulk-01","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-6420/0-5b54f7c85a.jpeg","price":4,"msrp":null,"flavor":null,"size":null,"weight":null,"qty":3,"favorite":false,"buy_limit_qty":3,"deleted":false},"available":true},{"code":"Icey-0716","brand":"STONEWALL KITCHEN","name":"test sync","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":true,"variant":{"sku":"sync-0716","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/Icey-0716/0-1a8beb0367.png","price":8,"msrp":7,"flavor":null,"size":null,"weight":"3","qty":47,"favorite":false,"buy_limit_qty":47,"deleted":false},"available":true},{"code":"YB-1002","brand":"STONEWALL KITCHEN","name":"Gluten-Free Pancake and Waffle Mix","region":"ARTISANAL USA","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"US-398","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-1002/0-f86fa3350b.jpeg","price":9.95,"msrp":null,"flavor":null,"size":null,"weight":"16 oz (453.6 g)","qty":10,"favorite":false,"buy_limit_qty":10,"deleted":false},"available":true},{"code":"Liya-11","brand":"MULINO BIANCO","name":"Settembrini Fig CookiesMulin","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"Liya-11","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/Liya-11/0-e224aadbf2.jpeg","price":6.49,"msrp":null,"flavor":null,"size":null,"weight":"2 fl","qty":55,"favorite":false,"buy_limit_qty":55,"deleted":false},"available":true},{"code":"YB-6328","brand":"DAIS","name":"test","region":"KOREA","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":true,"variant":{"sku":"delete-003","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-6328/0-21fb09986f.jpeg","price":8,"msrp":null,"flavor":null,"size":null,"weight":"6","qty":7,"favorite":false,"buy_limit_qty":7,"deleted":false},"available":true},{"code":"YB-1473","brand":"DELBA","name":"Non-GMO Whole Grain Muesli from Germanyfgdhgjjghjhjgdmfbgndbfnfndbnbnvbnvbxcmvbxcbnbnbvnxcbnvcxbvncx","region":"GERMANY","flavors_count":0,"sizes_count":0,"review_ratings":null,"in_stock":true,"new_product":false,"variant":{"sku":"DE-786","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-1473/0-6856d80bba.jpeg","price":6.95,"msrp":null,"flavor":null,"size":null,"weight":" 26.5 oz (750 g)","qty":3,"favorite":false,"buy_limit_qty":3,"deleted":false},"available":true}]
     * view_all_reorder_products_action_url : ybapp://ordered-products
     * reorder_products : []
     * static_banners : [{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/static_banner/cms/6c0f1e13-20ab-4f16-826f-f56e2e4c3c0c.png","action_url":"ybapp://search#region=Spain","description":"Sherry Span  test","title":"SherrySpan"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/static_banner/cms/e3c3ae27-2c21-484c-85b2-ce28032eb50a.jpg","action_url":"ybapp://external?url=https://www.wenjuan.com/?utm_source=baidu-ss&plan=EML3DZGN51&device=wap&renqun_youhua=184523&bd_vid=10854572283176192037","description":"test","title":"test external url [parameters]"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/static_banner/cms/0b4cad9d-1455-44ac-9f9c-8ef4b9fade92.jpg","action_url":"ybapp://external?url=https://www.baidu.com","description":"","title":"test external[no parameters]"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/static_banner/cms/04e232f4-780c-48a6-8077-3be33b430733.jpg","action_url":"ybapp://freebie","description":"freebie","title":"test"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/static_banner/cms/0f9e76bf-e2f7-4254-a0fb-81610ec4ce3c.png","action_url":"ybapp://search#region=Spain","description":"Sherry Span  test","title":"SherrySpan"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/static_banner/cms/2f40b26d-9346-45f9-9230-2763384da680.jpg","action_url":"ybapp://search?region=Japan","description":null,"title":"Japan"},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/static_banner/cms/14f15c63-b86b-4b5a-8026-18f7fdc0262e.jpg","action_url":"ybapp://search#region=Italy","description":null,"title":"Test \"#region=italy\""},{"image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/static_banner/cms/82dc54a7-a996-4b32-bb88-51030a28cf8d.jpg","action_url":"ybapp://search?region=Germany","description":null,"title":"Germany"}]
     * view_all_new_brands_action_url : null
     * feature_brands : [{"name":"Stonewall Kitchen","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/cms/be0fc3ce-8c09-4e91-9da7-4f869c0bad42.png","action_url":"ybapp://freebie"},{"name":"：；，:;,?/=&$@+ ' '\"","image_url":null,"action_url":"ybapp://search?brand=：；，:;,!()"},{"name":"A L'Olivier","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/cms/db1166a0-4003-4622-9c0e-f65d77a62ff5.jpg","action_url":"ybapp://search?brand=A L'Olivier"},{"name":"Toschi","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/cms/9c121082-409a-4a12-8f62-72e989d3ab16.png","action_url":"ybapp://search?brand=Toschi"},{"name":"Gyu-Kaku","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/cms/afdb2e00-6d4b-4c31-8416-3638e4244c6f.png","action_url":"ybapp://search?brand=Gyu-Kaku"},{"name":"Tre Marie","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/cms/aa141397-afae-45f6-a261-440dabc7003a.png","action_url":"ybapp://search?brand=Tre Marie"}]
     * view_all_new_products_action_url : ybapp://search?tag=new
     * new_products : [{"code":"YB-125","brand":"VIGNERI","name":"Vigneri t","region":"ARTISANAL USA","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"US-610","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-125/0-d8053d7fda.jpeg","price":9.95,"msrp":null,"flavor":null,"size":null,"weight":"4","qty":-53,"favorite":null,"buy_limit_qty":99,"deleted":null},"available":null},{"code":"PB-R-icey-001","brand":"STONEWALL KITCHEN","name":"test pr1","region":"ITALY","flavors_count":0,"sizes_count":5,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"PB-R-001","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/PB-R-icey-001/0-5eaa5178b4.jpeg","price":8,"msrp":9,"flavor":null,"size":"1","weight":"3","qty":0,"favorite":null,"buy_limit_qty":0,"deleted":null},"available":null},{"code":"YB-6328","brand":"DAIS","name":"test","region":"KOREA","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"delete-003","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-6328/0-21fb09986f.jpeg","price":8,"msrp":null,"flavor":null,"size":null,"weight":"6","qty":7,"favorite":null,"buy_limit_qty":7,"deleted":null},"available":null},{"code":"Icey-0716","brand":"STONEWALL KITCHEN","name":"test sync","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"sync-0716","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/Icey-0716/0-1a8beb0367.png","price":8,"msrp":7,"flavor":null,"size":null,"weight":"3","qty":47,"favorite":null,"buy_limit_qty":47,"deleted":null},"available":null},{"code":"YB-6327","brand":"ALBA","name":"test delete","region":"JAPAN","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"delete-07","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-6327/0-2d896a059b.jpeg","price":5,"msrp":null,"flavor":null,"size":null,"weight":"6","qty":8,"favorite":null,"buy_limit_qty":8,"deleted":null},"available":null},{"code":"r-icey-004","brand":"STONEWALL KITCHEN","name":"test pr4 ajax 55","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"pr-004","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/r-icey-004/0-0b7629d129.jpeg","price":11,"msrp":12,"flavor":null,"size":null,"weight":"6","qty":-66,"favorite":null,"buy_limit_qty":99,"deleted":null},"available":null},{"code":"Pb-R-icey-005","brand":"STONEWALL KITCHEN","name":"test pr5","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":false,"new_product":true,"variant":{"sku":"pr-005","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/Pb-R-icey-005/0-704b89f17c.jpeg","price":39,"msrp":13,"flavor":null,"size":null,"weight":"7","qty":0,"favorite":null,"buy_limit_qty":0,"deleted":null},"available":null},{"code":"YB-12","brand":"FUJI","name":"Soft Boiled Tea Eggs, Ready to Eat","region":"ARTISANAL USA","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"22583","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-12/0-d05182c3f4.jpeg","price":4.85,"msrp":null,"flavor":null,"size":null,"weight":null,"qty":9,"favorite":null,"buy_limit_qty":9,"deleted":null},"available":null},{"code":"YB-1","brand":"HON'S DRY NOODLES","name":"Sichuan Chili Style Dry Noodle Kit by Hon's","region":"TAIWAN","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"TW-132","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-1/0-443e50416f.jpeg","price":8.95,"msrp":null,"flavor":null,"size":null,"weight":"15.5 oz (440g)","qty":1,"favorite":null,"buy_limit_qty":1,"deleted":null},"available":null},{"code":"YB-448","brand":"HAKU","name":"Matsutake Shoyu Soy Sauce","region":null,"flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":false,"new_product":true,"variant":{"sku":"JP-367","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-448/0-5154603ab8.jpeg","price":25.95,"msrp":null,"flavor":null,"size":null,"weight":"16.9 fl oz. (500ml)","qty":0,"favorite":null,"buy_limit_qty":0,"deleted":null},"available":null},{"code":"R-icey-003","brand":"STONEWALL KITCHEN","name":"test pr3","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":false,"new_product":true,"variant":{"sku":"pr-003","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/R-icey-003/0-a7e287445e.jpeg","price":10,"msrp":11,"flavor":null,"size":null,"weight":"5","qty":0,"favorite":null,"buy_limit_qty":0,"deleted":null},"available":null},{"code":"Icey-0723-01","brand":"STONEWALL KITCHEN","name":"test sync","region":"ITALY","flavors_count":2,"sizes_count":2,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"sync-0723-01","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/Icey-0723-01/0-5d6a8483e4.jpeg","price":8,"msrp":9,"flavor":"1","size":"M","weight":"3","qty":-13,"favorite":null,"buy_limit_qty":99,"deleted":null},"available":null},{"code":"YB-2","brand":"APIDIS","name":"Taiwanese Dry Noodles Sesame Flavor Kit by Hon's icey","region":"TAIWAN","flavors_count":3,"sizes_count":11,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"TW-131","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-2/0-926547e43a.jpeg","price":60,"msrp":70,"flavor":"Apple","size":"0","weight":"10","qty":6,"favorite":null,"buy_limit_qty":6,"deleted":null},"available":null},{"code":"pb-r-icey-002","brand":"STONEWALL KITCHEN","name":"test pr2","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"pr-002","image_url":null,"price":9,"msrp":10,"flavor":null,"size":null,"weight":"4","qty":-20,"favorite":null,"buy_limit_qty":99,"deleted":null},"available":null},{"code":"Icey-0723-06","brand":"STONEWALL KITCHEN","name":"test sync","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"sync-0723-07","image_url":null,"price":8,"msrp":9,"flavor":null,"size":null,"weight":"3","qty":-5,"favorite":null,"buy_limit_qty":99,"deleted":null},"available":null},{"code":"YB-6338","brand":"ICEY TEST BRAND","name":"test image adtgiroec  s;ldfgjs;g xd;fgjf gfds;gjfl f xzg;jsdf;  dfg;sjgfd; f ;sfjgsjfhiosp;jggfhhgfj","region":"UNITED KINGDOM","flavors_count":2,"sizes_count":2,"review_ratings":0,"in_stock":false,"new_product":true,"variant":{"sku":"image-0729-01","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-6338/0-fe04d13cc3.jpeg","price":1,"msrp":6,"flavor":"sweet","size":"L","weight":"1","qty":0,"favorite":null,"buy_limit_qty":0,"deleted":null},"available":null},{"code":"Icey-0723-03","brand":"STONEWALL KITCHEN","name":"test sync","region":"ITALY","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"sync-0723-04","image_url":null,"price":8,"msrp":9,"flavor":null,"size":null,"weight":"3","qty":-5,"favorite":null,"buy_limit_qty":99,"deleted":null},"available":null},{"code":"YB-27","brand":"KASUGAI","name":"Roasted Green Peas test","region":"JAPAN","flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":false,"new_product":true,"variant":{"sku":"JP-412","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-27/0-2f0b6160d7.jpeg","price":1.95,"msrp":null,"flavor":null,"size":null,"weight":"2.57 oz (73g)","qty":0,"favorite":null,"buy_limit_qty":0,"deleted":null},"available":null},{"code":"YB-28","brand":"KASUGAI","name":"Roasted Hot Green Peas","region":null,"flavors_count":0,"sizes_count":0,"review_ratings":0,"in_stock":false,"new_product":true,"variant":{"sku":"JP-411","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-28/0-297612be0e.jpeg","price":1.95,"msrp":null,"flavor":null,"size":null,"weight":"2.36 oz (67g)","qty":0,"favorite":null,"buy_limit_qty":0,"deleted":null},"available":null},{"code":"YB-6332","brand":"STONEWALL KITCHEN","name":"lays stax ajax testtestst tttetttttttttttt ttttttttttesttestt tttttttttttttttttetexstset 122 3345t 6","region":"ITALY","flavors_count":2,"sizes_count":2,"review_ratings":0,"in_stock":true,"new_product":true,"variant":{"sku":"image-01","image_url":null,"price":7,"msrp":null,"flavor":"sweet","size":"M","weight":"1","qty":0,"favorite":null,"buy_limit_qty":99,"deleted":null},"available":null}]
     * view_all_recently_viewed_products_action_url : null
     * recently_viewed_products : []
     * favorite_products : []
     * available_rewards : 0
     * reward_background_image_url : https://yb-qa-static.s3.us-east-2.amazonaws.com/customer/image/admin/2020-01-20T09-27-04.604588.jpg
     */

    private Object last_order;
    private Object view_all_most_viewed_products_action_url;
    private String view_all_reorder_products_action_url;
    private Object view_all_new_brands_action_url;
    private String view_all_new_products_action_url;
    private Object view_all_recently_viewed_products_action_url;
    private int available_rewards;
    private String reward_background_image_url;
    private List<TopNavsBean> top_navs;
    private List<TopBannersBean> top_banners;
    private List<MostViewedProductsBean> most_viewed_products;
    private List<?> reorder_products;
    private List<StaticBannersBean> static_banners;
    private List<FeatureBrandsBean> feature_brands;
    private List<NewProductsBean> new_products;
    private List<?> recently_viewed_products;
    private List<?> favorite_products;

    public Object getLast_order() {
        return last_order;
    }

    public void setLast_order(Object last_order) {
        this.last_order = last_order;
    }

    public Object getView_all_most_viewed_products_action_url() {
        return view_all_most_viewed_products_action_url;
    }

    public void setView_all_most_viewed_products_action_url(Object view_all_most_viewed_products_action_url) {
        this.view_all_most_viewed_products_action_url = view_all_most_viewed_products_action_url;
    }

    public String getView_all_reorder_products_action_url() {
        return view_all_reorder_products_action_url;
    }

    public void setView_all_reorder_products_action_url(String view_all_reorder_products_action_url) {
        this.view_all_reorder_products_action_url = view_all_reorder_products_action_url;
    }

    public Object getView_all_new_brands_action_url() {
        return view_all_new_brands_action_url;
    }

    public void setView_all_new_brands_action_url(Object view_all_new_brands_action_url) {
        this.view_all_new_brands_action_url = view_all_new_brands_action_url;
    }

    public String getView_all_new_products_action_url() {
        return view_all_new_products_action_url;
    }

    public void setView_all_new_products_action_url(String view_all_new_products_action_url) {
        this.view_all_new_products_action_url = view_all_new_products_action_url;
    }

    public Object getView_all_recently_viewed_products_action_url() {
        return view_all_recently_viewed_products_action_url;
    }

    public void setView_all_recently_viewed_products_action_url(Object view_all_recently_viewed_products_action_url) {
        this.view_all_recently_viewed_products_action_url = view_all_recently_viewed_products_action_url;
    }

    public int getAvailable_rewards() {
        return available_rewards;
    }

    public void setAvailable_rewards(int available_rewards) {
        this.available_rewards = available_rewards;
    }

    public String getReward_background_image_url() {
        return reward_background_image_url;
    }

    public void setReward_background_image_url(String reward_background_image_url) {
        this.reward_background_image_url = reward_background_image_url;
    }

    public List<TopNavsBean> getTop_navs() {
        return top_navs;
    }

    public void setTop_navs(List<TopNavsBean> top_navs) {
        this.top_navs = top_navs;
    }

    public List<TopBannersBean> getTop_banners() {
        return top_banners;
    }

    public void setTop_banners(List<TopBannersBean> top_banners) {
        this.top_banners = top_banners;
    }

    public List<MostViewedProductsBean> getMost_viewed_products() {
        return most_viewed_products;
    }

    public void setMost_viewed_products(List<MostViewedProductsBean> most_viewed_products) {
        this.most_viewed_products = most_viewed_products;
    }

    public List<?> getReorder_products() {
        return reorder_products;
    }

    public void setReorder_products(List<?> reorder_products) {
        this.reorder_products = reorder_products;
    }

    public List<StaticBannersBean> getStatic_banners() {
        return static_banners;
    }

    public void setStatic_banners(List<StaticBannersBean> static_banners) {
        this.static_banners = static_banners;
    }

    public List<FeatureBrandsBean> getFeature_brands() {
        return feature_brands;
    }

    public void setFeature_brands(List<FeatureBrandsBean> feature_brands) {
        this.feature_brands = feature_brands;
    }

    public List<NewProductsBean> getNew_products() {
        return new_products;
    }

    public void setNew_products(List<NewProductsBean> new_products) {
        this.new_products = new_products;
    }

    public List<?> getRecently_viewed_products() {
        return recently_viewed_products;
    }

    public void setRecently_viewed_products(List<?> recently_viewed_products) {
        this.recently_viewed_products = recently_viewed_products;
    }

    public List<?> getFavorite_products() {
        return favorite_products;
    }

    public void setFavorite_products(List<?> favorite_products) {
        this.favorite_products = favorite_products;
    }

    public static class TopNavsBean {
        /**
         * name : FOOD
         * image_url : https://dwsp25y3tlu88.cloudfront.net/cdn/image/small/cms/5db9d50c-e3c5-4ca9-b14c-6733e1378ca0.png
         * action_url : ybapp://search?nav=food
         */

        private String name;
        private String image_url;
        private String action_url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getAction_url() {
            return action_url;
        }

        public void setAction_url(String action_url) {
            this.action_url = action_url;
        }
    }

    public static class TopBannersBean {
        /**
         * image_url : https://dwsp25y3tlu88.cloudfront.net/cdn/image/top_banner/cms/38f1e3d8-d4a3-4ca3-965f-02e41b468ccd.png
         * action_url : ybapp://all-brands
         * description : null
         * title : New
         */

        private String image_url;
        private String action_url;
        private Object description;
        private String title;

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getAction_url() {
            return action_url;
        }

        public void setAction_url(String action_url) {
            this.action_url = action_url;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class MostViewedProductsBean {
        /**
         * code : Icey-0723-01
         * brand : STONEWALL KITCHEN
         * name : test sync
         * region : ITALY
         * flavors_count : 4
         * sizes_count : 4
         * review_ratings : null
         * in_stock : true
         * new_product : true
         * variant : {"sku":"sync-0723-01","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/Icey-0723-01/0-5d6a8483e4.jpeg","price":8,"msrp":9,"flavor":"1","size":"M","weight":"3","qty":-13,"favorite":false,"buy_limit_qty":99,"deleted":false}
         * available : true
         */

        private String code;
        private String brand;
        private String name;
        private String region;
        private int flavors_count;
        private int sizes_count;
        private Object review_ratings;
        private boolean in_stock;
        private boolean new_product;
        private VariantBean variant;
        private boolean available;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public int getFlavors_count() {
            return flavors_count;
        }

        public void setFlavors_count(int flavors_count) {
            this.flavors_count = flavors_count;
        }

        public int getSizes_count() {
            return sizes_count;
        }

        public void setSizes_count(int sizes_count) {
            this.sizes_count = sizes_count;
        }

        public Object getReview_ratings() {
            return review_ratings;
        }

        public void setReview_ratings(Object review_ratings) {
            this.review_ratings = review_ratings;
        }

        public boolean isIn_stock() {
            return in_stock;
        }

        public void setIn_stock(boolean in_stock) {
            this.in_stock = in_stock;
        }

        public boolean isNew_product() {
            return new_product;
        }

        public void setNew_product(boolean new_product) {
            this.new_product = new_product;
        }

        public VariantBean getVariant() {
            return variant;
        }

        public void setVariant(VariantBean variant) {
            this.variant = variant;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public static class VariantBean {
            /**
             * sku : sync-0723-01
             * image_url : https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/Icey-0723-01/0-5d6a8483e4.jpeg
             * price : 8
             * msrp : 9
             * flavor : 1
             * size : M
             * weight : 3
             * qty : -13
             * favorite : false
             * buy_limit_qty : 99
             * deleted : false
             */

            private String sku;
            private String image_url;
            private float price;
            private int msrp;
            private String flavor;
            private String size;
            private String weight;
            private int qty;
            private boolean favorite;
            private int buy_limit_qty;
            private boolean deleted;

            public String getSku() {
                return sku;
            }

            public void setSku(String sku) {
                this.sku = sku;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public float getPrice() {
                return price;
            }

            public void setPrice(float price) {
                this.price = price;
            }

            public int getMsrp() {
                return msrp;
            }

            public void setMsrp(int msrp) {
                this.msrp = msrp;
            }

            public String getFlavor() {
                return flavor;
            }

            public void setFlavor(String flavor) {
                this.flavor = flavor;
            }

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public int getQty() {
                return qty;
            }

            public void setQty(int qty) {
                this.qty = qty;
            }

            public boolean isFavorite() {
                return favorite;
            }

            public void setFavorite(boolean favorite) {
                this.favorite = favorite;
            }

            public int getBuy_limit_qty() {
                return buy_limit_qty;
            }

            public void setBuy_limit_qty(int buy_limit_qty) {
                this.buy_limit_qty = buy_limit_qty;
            }

            public boolean isDeleted() {
                return deleted;
            }

            public void setDeleted(boolean deleted) {
                this.deleted = deleted;
            }
        }
    }

    public static class StaticBannersBean {
        /**
         * image_url : https://dwsp25y3tlu88.cloudfront.net/cdn/image/static_banner/cms/6c0f1e13-20ab-4f16-826f-f56e2e4c3c0c.png
         * action_url : ybapp://search#region=Spain
         * description : Sherry Span  test
         * title : SherrySpan
         */

        private String image_url;
        private String action_url;
        private String description;
        private String title;

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getAction_url() {
            return action_url;
        }

        public void setAction_url(String action_url) {
            this.action_url = action_url;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static class FeatureBrandsBean {
        /**
         * name : Stonewall Kitchen
         * image_url : https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/cms/be0fc3ce-8c09-4e91-9da7-4f869c0bad42.png
         * action_url : ybapp://freebie
         */

        private String name;
        private String image_url;
        private String action_url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getAction_url() {
            return action_url;
        }

        public void setAction_url(String action_url) {
            this.action_url = action_url;
        }
    }

    public static class NewProductsBean {
        /**
         * code : YB-125
         * brand : VIGNERI
         * name : Vigneri t
         * region : ARTISANAL USA
         * flavors_count : 0
         * sizes_count : 0
         * review_ratings : 0
         * in_stock : true
         * new_product : true
         * variant : {"sku":"US-610","image_url":"https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-125/0-d8053d7fda.jpeg","price":9.95,"msrp":null,"flavor":null,"size":null,"weight":"4","qty":-53,"favorite":null,"buy_limit_qty":99,"deleted":null}
         * available : null
         */

        private String code;
        private String brand;
        private String name;
        private String region;
        private int flavors_count;
        private int sizes_count;
        private int review_ratings;
        private boolean in_stock;
        private boolean new_product;
        private VariantBeanX variant;
        private Object available;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public int getFlavors_count() {
            return flavors_count;
        }

        public void setFlavors_count(int flavors_count) {
            this.flavors_count = flavors_count;
        }

        public int getSizes_count() {
            return sizes_count;
        }

        public void setSizes_count(int sizes_count) {
            this.sizes_count = sizes_count;
        }

        public int getReview_ratings() {
            return review_ratings;
        }

        public void setReview_ratings(int review_ratings) {
            this.review_ratings = review_ratings;
        }

        public boolean isIn_stock() {
            return in_stock;
        }

        public void setIn_stock(boolean in_stock) {
            this.in_stock = in_stock;
        }

        public boolean isNew_product() {
            return new_product;
        }

        public void setNew_product(boolean new_product) {
            this.new_product = new_product;
        }

        public VariantBeanX getVariant() {
            return variant;
        }

        public void setVariant(VariantBeanX variant) {
            this.variant = variant;
        }

        public Object getAvailable() {
            return available;
        }

        public void setAvailable(Object available) {
            this.available = available;
        }

        public static class VariantBeanX {
            /**
             * sku : US-610
             * image_url : https://dwsp25y3tlu88.cloudfront.net/cdn/image/large/product/YB-125/0-d8053d7fda.jpeg
             * price : 9.95
             * msrp : null
             * flavor : null
             * size : null
             * weight : 4
             * qty : -53
             * favorite : null
             * buy_limit_qty : 99
             * deleted : null
             */

            private String sku;
            private String image_url;
            private double price;
            private Object msrp;
            private Object flavor;
            private Object size;
            private String weight;
            private int qty;
            private Object favorite;
            private int buy_limit_qty;
            private Object deleted;

            public String getSku() {
                return sku;
            }

            public void setSku(String sku) {
                this.sku = sku;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            public Object getMsrp() {
                return msrp;
            }

            public void setMsrp(Object msrp) {
                this.msrp = msrp;
            }

            public Object getFlavor() {
                return flavor;
            }

            public void setFlavor(Object flavor) {
                this.flavor = flavor;
            }

            public Object getSize() {
                return size;
            }

            public void setSize(Object size) {
                this.size = size;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public int getQty() {
                return qty;
            }

            public void setQty(int qty) {
                this.qty = qty;
            }

            public Object getFavorite() {
                return favorite;
            }

            public void setFavorite(Object favorite) {
                this.favorite = favorite;
            }

            public int getBuy_limit_qty() {
                return buy_limit_qty;
            }

            public void setBuy_limit_qty(int buy_limit_qty) {
                this.buy_limit_qty = buy_limit_qty;
            }

            public Object getDeleted() {
                return deleted;
            }

            public void setDeleted(Object deleted) {
                this.deleted = deleted;
            }
        }
    }
}
