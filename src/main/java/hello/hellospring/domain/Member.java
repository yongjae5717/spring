package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//jpa를 사용하기 위해서 @Entity 사용
@Entity
public class Member {

    //pk mapping
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //db가 알아서 생성해주는 것:IDENTITY
    private  Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
