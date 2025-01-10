public abstract class Books implements PublicationProcess{
    int bookid;
    String author;
    int price;
    final String publication = "penguin";
    final String getDetailsofPublicationHouse(){
        return publication;
    }
}
