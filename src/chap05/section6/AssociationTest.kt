package chap05.section6.association

// 연관관계
class Patient(val name: String) {
    // 인자로 참조
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {
    // 인자로 참조
    fun patientList(p: Patient) {
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doc1 = Doctor("KimSabu")
    val patient1 = Patient("Killdong")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}
