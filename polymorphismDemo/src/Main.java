public class Main {

    public static void main(String[] args) {
	    EmailLogger emailLogger =new EmailLogger();
        emailLogger.log("Log Mesajı");
        BaseLogger[] loggers =new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger(), new ConsoleLogger()};
        for (BaseLogger logger : loggers){
            logger.log("Log Mesajı");
        }
        CustomerManager customerManager=new CustomerManager(new FileLogger());
        customerManager.add();
    }
}
