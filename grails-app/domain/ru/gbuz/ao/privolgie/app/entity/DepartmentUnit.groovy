package ru.gbuz.ao.privolgie.app.entity

import ru.gbuz.ao.privolgie.security.Person

class DepartmentUnit {

    static belongsTo = [Department]
    static hasMany = [cabinets: Cabinet, specialists: Specialist]

    String title
    String definition
    String addres
    String phone
    String email
    Person director
    PassportLPU passportLPU
    Department department
    Double longitude
    Double latitude


    static constraints = {
        title(blank: false, nullable: false)
        director(blank: true, nullable: true)
        addres(blank: true, nullable: true, size: 0..2000)
        phone(blank: true, nullable: true)
        email(blank: true, nullable: true)
        definition(blank: true, nullable: true, size: 0..2000)
        passportLPU(blank: true, nullable: true)
        cabinets(blank: true, nullable: true)
        department(blank: true, nullable: true)
        longitude(blank: true, nullable: true, scale: 9)
        latitude(blank: true, nullable: true, scale: 9)
    }

    String toString() {
        title
    }
}
