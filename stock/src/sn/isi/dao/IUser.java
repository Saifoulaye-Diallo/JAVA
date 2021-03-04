package sn.isi.dao;

import sn.isi.enitities.User;

import java.util.List;

public interface IUser {
        public int add(User U) throws Exception;
        public List<User> liste() throws Exception;
        public int update(User U) throws Exception;
        public int delete(int id) throws Exception;
}
