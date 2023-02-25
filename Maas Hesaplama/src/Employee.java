public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(double salary) {
        if (this.salary <= 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus(int workHours) {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary(int hireYear) {
        if (2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        } else if (2021 - this.hireYear >= 10 && 2021 - this.hireYear < 20) {
            return this.salary * 0.1;
        } else if (2021 - this.hireYear >= 20) {
            return this.salary * 0.15;
        }
        return 0;
    }

    public String toString() {
        return "Adı: " + name + "\n" +
                "Maaşı: " + salary + "\n" +
                "Çalışma Saati: " + workHours + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax(salary) + "\n" +
                "Bonus: " + bonus(workHours) + "\n" +
                "Maaş Artışı: " + raiseSalary(hireYear) + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + (salary - tax(salary) + bonus(workHours)) + "\n" +
                "Toplam Maaş: " + (salary + raiseSalary(hireYear));
    }
}

