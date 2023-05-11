package Design_Pattern.Builder;

public class Student {
    private String name;
    private int age;
    private String address;
    private String gender;
    private  double psp;
    private Student(Builder b){
        this.name=b.getName();
        this.age=b.getAge();
        this.address=b.getAddress();
        this.psp=b.getPsp();
        this.gender=b.getGender();
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public static class Builder {
        private String name;
        private int age;
        private String address;
        private String gender;
        private  double psp;
        private Builder (){}
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public String getGender() {
            return gender;
        }

        public double getPsp() {
            return psp;
        }

        public boolean validate(){
            if(age <18 && psp <  60){
                return  false;
            }
            return  true;
        }
        public Student build() throws Exception {
            if(!validate()){
                throw new Exception("Invalid data");
            }
            return  new Student(this);
        }
    }
}
