package reporsitory;

import reporsitory.custom.Impl.CustomerDaoImpl;
import reporsitory.custom.Impl.ItemDaoImpl;
import reporsitory.custom.Impl.OrderDaoImpl;
import util.DaoType;
import util.ServiceType;

public class DaoFactory {
    private static DaoFactory instance;

    private DaoFactory(){}

    public static DaoFactory getInstance(){
        return instance==null? instance=new DaoFactory():instance;
    }

    public <T extends SuperDao>T getDaoType(DaoType type){
        switch (type){
            case CUSTOMER:return (T) new CustomerDaoImpl();
            case ITEM:return (T) new ItemDaoImpl();
            case ORDER:return (T) new OrderDaoImpl();
        }
        return null;
    }

}
