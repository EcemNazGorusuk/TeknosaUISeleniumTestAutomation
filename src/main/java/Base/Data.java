package Base;

public class Data extends DataHelper{
    public static String email="ecemnazgorusuk@gmail.com";
    public static String password="Ecem12345";
    public String url="https://www.teknosa.com/login";
    public String errMsgForWrongEmail="Mail adresi ile kayıtlı bir hesap bulunamamıştır. Üye Ol seçeneği ile üye olabilirsiniz.";
    public String errMsgForWrongPassword="Hatalı şifre girdiniz. Lütfen tekrar deneyin ya da Şifremi Unuttum seçeneği ile şifrenizi sıfırlayınız.";
    public String maxCharacter="eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
    public String minCharacter="12";
    public String errMessageEmailOrPhone="Lütfen e-posta adresinizi veya telefon numaranızı giriniz";
    public String emptyErrPassword="Lütfen şifrenizi giriniz";

    @Override
    public String formatEnterItemToSearch(String enterItemToSearch) {
        return super.formatEnterItemToSearch(enterItemToSearch);
    }
}
