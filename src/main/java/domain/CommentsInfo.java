package domain;

public class CommentsInfo {
    private int count; // Количество Инфо
    private boolean canPost; // можно ли писать комменты
    // + get/set на все поля
    private String userName ; //Имя комментатора

    //heading,record имеются в классе Post, куда лучше убрать?
    // (у ВК есть предвывод одного сообщения, но все комменты видны только войдя в список)
    private String heading; // Тема поста
    private String record; //Текст поста

    private String commentDate ; //время комментария

    private int likeCountComment; // количество поставленных лайков комментарию
    private boolean likeStatusComment; // Проставлен ли лайк под текущей УЗ комментарию
    private String likesOwnerComment; //Кто поставил лайк комментарию


}