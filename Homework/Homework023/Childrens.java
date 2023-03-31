public class Childrens extends Parents {

    public Childrens(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String getInfo() {
        System.out.println("Перегрузка метода для Childrens");
        return super.getInfo();
    }
    
}
