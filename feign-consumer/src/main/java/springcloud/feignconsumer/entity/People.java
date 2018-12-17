package springcloud.feignconsumer.entity;

/**
 * @author V_Happy.L.K
 * @date 2018/12/17 16:38
 */
public class People {
    private Integer id;
    private String name;
    private Integer age;

    // 必须要有空参构造函数
    public People() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
