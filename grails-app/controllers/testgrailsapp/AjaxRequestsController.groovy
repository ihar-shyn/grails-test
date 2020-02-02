package testgrailsapp

import grails.converters.JSON

class AjaxRequestsController {

    def index() {
        "main ajax"
    }

    def getData() {
        Map data = [:]
        List objects = []
        def object1 = [id:1, name:'Name1', description:'it is object1', label:'yyy1']
        objects << object1
        def object2 = [id:2, name:'Name2', description:'', label:'xxx']
        objects << object2
        def object3 = [id:3, name:'Name3', description:'it is object3', label:'']
        objects << object3

        data << [objects:objects]

        render data as JSON
    }
}
