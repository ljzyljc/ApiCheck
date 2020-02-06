package com.jackie.lib

import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

class Test{
    static void main(String[] args){
        println "this is my groovy"
        Test test = new Test()
        test.testSluper()
    }

    class Person{
        String name
        int age
    }

    def list = [new Person(name: 'John', age: 25),
                new Person(name: 'Major', age: 26)]

    public void test(){
        def json = JsonOutput.toJson(list)
        println JsonOutput.prettyPrint(json)

        def jsonSlpuer = new JsonSlurper()
        def list1 = jsonSlpuer.parseText(json)
        println list1.getClass()

    }

    public void testSluper(){
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}')
        println(object.name)
        println(object.ID)

    }





}