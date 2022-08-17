package co.com.mintic.misiontic.ciclo3.model;

@Entity
public class Profile {
    @Id
    private String id;
    private String image;
    private String phone;
    private User user;
    private Date createdAt;
    private Date updatedAt;
}

public class Employee {
    private Long id;
    private String email;
    private Profile profile;
    private Enum_RoleName role;
    private Enterprise entiprise;
    private Transaction[] transactions;
    private Date updatedAt;
    private Date createdAt;
}

public class Transaction {
    @Id
    private Long id;
    private String concept;
    private Float amount;
    private User user;
    private Enterprise enterprise;
    private Date createdAt;
    private Date updatedAt;

}

public class Enum_RoleName {
    private String type Admin;
    private String type Operario;

}

public class Enterprise {
    @Id
    private Long id;
    @Unique
    private  String name;

}