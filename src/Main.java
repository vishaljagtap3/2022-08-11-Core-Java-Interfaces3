public class Main {

    public static void main(String[] args) {
        Student[] students = {
                new Student(12, "DD", 54.34f),
                new Student(44, "FF", 66.34f),
                new Student(28, "ZZ", 94.34f),
                new Student(55, "AA", 49.34f),
                new Student(9, "EE", 72.34f),
                new Student(39, "CC", 81.34f),
                new Student(26, "HH", 26.34f),
        };

        NewUtil.sort(students, new StudentComparatorByMarksAsc());
        for(Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        NewUtil.sort(students, new StudentComparatorByRollAsc());
        for(Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        NewUtil.sort(students, new StudentComparatorByMarksDesc());
        for(Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        Product [] products = {
                new Product(303, "Laptop", 2342F),
                new Product(101, "Phone", 2942F),
                new Product(909, "Android Tab", 1342F),
                new Product(808, "Pen tab", 342F),
                new Product(606, "Charger", 3620F),
                new Product(202, "Watch", 1234F),
                new Product(503, "Smart Watch", 1980F),
        };



        System.out.println();

        NewUtil.sort(products, new ProductComparatorByPrice());
        for(Product product : products) {
            System.out.println(product);
        }
        System.out.println();
    }

    public static void main1(String[] args) {
        Student[] students = {
                new Student(12, "DD", 54.34f),
                new Student(44, "FF", 66.34f),
                new Student(28, "ZZ", 94.34f),
                new Student(55, "AA", 49.34f),
                new Student(9, "EE", 72.34f),
                new Student(39, "CC", 81.34f),
                new Student(26, "HH", 26.34f),
        };

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println();
        Util.sortByMarksAsc(students);

        for(Student student : students) {
            System.out.println(student);
        }

        System.out.println("-----------------------------------");

        Product [] products = {
                new Product(303, "Laptop", 2342F),
                new Product(101, "Phone", 2942F),
                new Product(909, "Android Tab", 1342F),
                new Product(808, "Pen tab", 342F),
                new Product(606, "Charger", 3620F),
                new Product(202, "Watch", 1234F),
                new Product(503, "Smart Watch", 1980F),
        };

        for(Product product : products) {
            System.out.println(product);
        }

        System.out.println();
        Util.sortProducts(products);

        for(Product product : products) {
            System.out.println(product);
        }
    }
}
