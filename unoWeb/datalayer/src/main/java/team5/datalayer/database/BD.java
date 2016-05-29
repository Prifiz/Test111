package team5.datalayer.database;

import org.apache.log4j.Logger;
import team5.datalayer.hibernate.dao.CardDao;
import team5.datalayer.hibernate.dao.ColorDao;
import team5.datalayer.hibernate.dao.ServiceInfoDao;
import team5.datamodel.card.Card;
import team5.datamodel.card.Color;
import team5.datamodel.user.ServiceInfo;

/**
 *
 * @author Dmitry
 */
public class BD {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(BD.class);
        // Creator creator = new Creator();
        //Droper droper=new Droper();
        // Searcher searcher=new Searcher();
        // DataBaseWorker dbworker = new DataBaseWorker();
        //  dbworker.openConnectionDataBase();
        //creator.createAddresses();
        //  droper.dropDataBase();
        // dbworker.closeConnectionDataBase();
        //creator.createAddresses();
        //System.out.println(searcher.search("Bob"));
        try {
//            PrivateInformationDao privateInformationDao = DaoFactory.getPrivateInformationDao();
//            ServiceInfoDao serviceInfoDao = new ServiceInfoDao();
//            AddressDao addressDao = new AddressDao();
//            PrivateInformation privateInformationTest = new PrivateInformation("Boblogin", "Bob", "Bobov", LocalDate.now());
//            ServiceInfo serviceInfoTest = new ServiceInfo("Boblogin", "1q", "bob@mail.com");
//            Address addressTest = new Address("Boblogin", "Moscow", "Russia");
//
//            privateInformationDao.savePrivateInformation(privateInformationTest);
//            serviceInfoDao.saveServiceInfo(serviceInfoTest);
//            addressDao.saveAddress(addressTest);
//
//            PrivateInformation privateInformation = privateInformationDao.getPrivateInformationByLogin("Boblogin");
//            ServiceInfo serviceInfo = serviceInfoDao.getServiceInfoByLogin("Boblogin");
//            Address address = addressDao.getAddressByLogin("Boblogin");
//            System.out.println(serviceInfo.toString());
//            System.out.println(privateInformation.toString());
//            System.out.println(address.toString());

            ColorDao colorDao = new ColorDao();
            Color color = colorDao.getColorById(1);
            System.out.println(color.toString());

            CardDao cardDao = new CardDao();
            Card card = cardDao.getCardById(10);
            System.out.println(card.getCardId() + " " + card.getColorId() + " " + card.getIconId());
            ServiceInfoDao serv = new ServiceInfoDao();
            ServiceInfo info = serv.getServiceInfoByLogin("Andrew");
            System.out.println(info.getLogin()+" "+info.getPassword()+" "+info.getEmail());
        } catch (ExceptionInInitializerError ex) {
            logger.error(ex.getMessage(), ex);
            System.out.println(ex.getStackTrace().toString());
            throw ex;
        }
    }

}
