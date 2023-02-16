package patterns.creational_design_patterns.factory_pattern;

/**
 * packageName :  patterns.factoryMethod
 * fileName : Animal
 * author :  eisen
 * date : 2022/04/17
 * description :
 * ===========================================================
 * DATE                 AUTHOR                NOTE
 * -----------------------------------------------------------
 * 2022/04/17                eisen             최초 생성
 */
public abstract class Animal {
    private String kind;

    public void kind(String kind){
        this.kind = kind;
    }
    public void speak() {
        System.out.println("짖는다.");
    }
}
