package ru.gbuz.ao.privolgie.vocs

/**
 * ������������� ���������� (�����)
 */

class Speciality {

    String title
    String description

    static constraints = {
        title(blank: false, nullable: false)
        description(blank: true, nullable: true, size: 0..254)
    }

    String toString() {
        title
    }

}
