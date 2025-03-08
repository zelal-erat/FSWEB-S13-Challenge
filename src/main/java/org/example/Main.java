package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args) {
        // 1. Healthplan nesnesi oluştur
        Healthplan healthplan1 = new Healthplan(1, "A Sigorta", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "B Sigorta", Plan.PREMIUM);

        // 2. Employee nesnesi oluştur ve sağlık planını ekle
        String[] healthPlans = new String[2];
        healthPlans[0] = healthplan1.getName();  // "A Sigorta"
        Employee employee = new Employee(1, "John Doe", "jd@test.com", "1234", healthPlans);

        // 3. Company nesnesi oluştur
        String[] developerNames = new String[2];
        developerNames[0] = employee.getFullName();  // "John Doe"
        Company company = new Company(1, "TechCorp", 5000, developerNames);

        // 4. addHealthplan ve addEmployee metotlarını test et
        employee.addHealthPlan(1, "C Sigorta");  // Sağlık planını ekleyelim
        company.addEmployee(1, "Jane Smith");  // Yeni bir çalışan ekleyelim

        // 5. Çıktı gösterelim
        System.out.println("Employee's Health Plans: ");
        for (String plan : employee.getHealthPlans()) {
            if (plan != null) {
                System.out.println(plan);
            }
        }

        System.out.println("\nCompany Details:");
        System.out.println(company);

        System.out.println("\nEmployee Details:");
        System.out.println(employee);
    }
}
