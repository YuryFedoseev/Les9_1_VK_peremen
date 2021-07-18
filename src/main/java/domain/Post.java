package domain;

public class Post {
    private int id; //уникальный индификатор БД
    private int ownerId; // поле из документации


    //heading,record имеются в классе CommentsInfo, куда лучше убрать?
    // (у ВК есть предвывод одного сообщения, но все комменты видны только войдя в список)
    private String heading; // Тема поста
    private String record; //Текст поста

    private int likeCountPost; // количество поставленных лайков посту
    private boolean likeStatusPost; // Проставлен ли лайк под текущей УЗ к данному посту
    private String likesOwnerPost; //Кто поставил лайк посту

    private int commentCount; // количество коментариев
    private String commentOwner; //Кто поставил лайк
    private String commentText; //Текст коментария --String если нет возможности загружать файлы/фото


    private int repostCount; //Количество репостов
    private String repostUser; //Кто сделал репост

    private boolean recordIsPinned; //закреплена ли запись в ленте

    private String postDate ; //время поста

    private CommentsInfo commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    // + get/set на все поля
}