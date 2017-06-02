/**
 * Created by LENOVO on 2.06.2017.
 */
import org.apache.log4j.*;
public class Log4jTest {
    public static void main(String[] args) {
        BasicConfigurator  basicConfigurator;
        Logger logger=Logger.getLogger(Stundent.class);
        logger.info("initializing ");
        Stundent stundent=new Stundent(123,"özgür","bircan");
        logger.info(stundent.getFirstName());

    }



}
