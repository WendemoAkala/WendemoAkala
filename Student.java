package StudentGeneric;

    public class Student<T> {
        private String firstName;
        private String lastName;
        private int age;
        private T subject;

        public Student(String firstName, String lastName, int age, T subject) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.subject = subject;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public T getSubject() {
            return this.subject;
        }

        public void setSubject(T subject) {
            this.subject = subject;
        }

        public void printStudent() {
            //*Print student information
            System.out.println("Student Information:");
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Subject: " + subject.getClass().getSimpleName());
        }
    }