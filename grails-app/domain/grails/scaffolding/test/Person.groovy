package grails.scaffolding.test

class Person {

    String name
    Date dob

    static hasMany = [ books: Book ]

    static constraints = {
    }
}
