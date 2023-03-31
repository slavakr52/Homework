public class Parents extends Grandparents {

    public Parents(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String getInfo() {
        System.out.println("Перегрузка метода для Parents");
        return super.getInfo();
    }

    

}
