package ru.gbuz.ao.privolgie.app.site

/**
 * ������� ������ � ���� ������������, ��� ���� ������� ����������� ������ �� ������������
 */

import ru.gbuz.ao.privolgie.vocs.SectionMedicalCare

class PaidService {

    static hasMany = [SectionMedicalCare]

    String title
    String definition

    static constraints = {
        title(blank: false, nullable: false)
    }

    String toString() {
        title
    }
}
