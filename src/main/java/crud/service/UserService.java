package crud.service;

import crud.model.UserCrud;

import java.util.List;

public interface UserService {
    void addUser(UserCrud userCrud);
    UserCrud getUser(Long id);

    void removeUser(Long id) ;

    List<UserCrud> getListUsers();
    void updateUser(UserCrud userCrud, Long id);



}
