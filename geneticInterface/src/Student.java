public class Student<t> implements IDatabase<T> {
  // Student yerine stringte atabilirdik fakat ne veri atarsan ona göre sekillensin diye Student yaptık yaptık
    @Override
    public boolean insert(T data) {
        return true;
    }

    @Override
    public boolean delete(T data) {
        return true;
    }

    @Override
    public boolean update(T data) {
        return true;
    }

    @Override
    public void select(T data) {

    }
}
