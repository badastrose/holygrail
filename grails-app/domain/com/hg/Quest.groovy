package com.hg

class Quest {
    String name
    Date startDate = new Date()

    static hasMany = [tasks:Task]

    static constraints = {
        name notEqual: "Poop"
        startDate()
    }
}
