package tutorials;

public class _41_Oop {

    //polymorphism = cok bicimlilik
    //encapsulation = private
    //abstraction = abstract+interface

    //Bean
    //POJO

    //access modifier
    //public:butun pakettlerdden erisim saglanir
    //private:sadece o classta erisim vardur
    //protected: ayni pakeetin ayni clasinda erisim vardir farkli clasta erisim olmasi icin kalitimlamak lazim
    //-=sadece ayni pakettekiler erisim saglaya bilir

    //new: hafizada benim bir icin bir yer ac
    //null: olan hafizayi bosaltir
    //sifir: kapladigi bir alan vardir ancak degeri sifirdir

    //overloading: asiri yukleme ayni isimdeki metotlara ancak farkli paramewterele olamalari gerekiyor
    //ovveride: var olan kurallar yerine benim dedigim kurallar gecerli


    //return: metodu kirar
    //break: donguyu kirar
    //continue: devam eden 1 kere mahsusn es gec donguye devam etsin

    //final
    //degiskenlerde sabittik
    //class extends edemeyizz
    //metotlarda override edemeyiz

    //static new olusturmadan verilere erisim saglamak
    //classAdi.deger

    //instance of

    public static void main(String[] args) {
        _45_PencilBean bean=new _45_PencilBean();
        if (bean instanceof _45_PencilBean) {
            System.out.println("evet");
        }else {
            System.out.println("hayir");
        }

    }


}
