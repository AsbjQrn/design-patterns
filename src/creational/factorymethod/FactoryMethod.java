package creational.factorymethod;

public class FactoryMethod {


    //use getPlan method to get object of type Plan
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DÅRLIGPLAN")) {
            return new DaarligPlan();
        } else if (planType.equalsIgnoreCase("GODPLAN")) {
            return new GodPlan();
        }
        return null;
    }
}
