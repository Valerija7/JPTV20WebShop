package entity;

import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-03-24T10:33:33")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> salt;
    public static volatile SingularAttribute<User, Double> money;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile ListAttribute<User, List> listProducts;
    public static volatile SingularAttribute<User, Long> id;
    public static volatile SingularAttribute<User, String> login;

}