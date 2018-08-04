package idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.robots;

import idadedocachorro.studio.com.br.idadedocachorro.R;
import idadedocachorro.studio.com.br.idadedocachorro.common.ScreenRobot;

import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.Constants.ConstantsHome.BTN_IDADE;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.Constants.ConstantsHome.HEADER_APP;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.Constants.ConstantsHome.IDADE_DOG;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.Constants.ConstantsHome.IDADE_VAZIA;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.Constants.ConstantsHome.TXT_HOME;
import static idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.Constants.ConstantsHome.TXT_HUMAN;

public class HomeRobot extends ScreenRobot<HomeRobot>{

     public static final int IMG_DOG  = R.id.imageView2;
     public static final int LABEL_IDADE = R.id.numero;
     public static final int VALIDARBTN = R.id.btnIdade;
     public static final int IDADE_HUMANA = R.id.resultado;





    public HomeRobot checkImgDisplayed() {
        checkIsDisplayed (IMG_DOG);
        return this;
    }

    public HomeRobot checkHeader(){
        checkViewContainsText (HEADER_APP);
        return this;
    }

    public HomeRobot checkTxt(){
        checkViewContainsText (TXT_HOME);
        return this;
    }

    public HomeRobot checkLabel(){
        checkIsClickable (LABEL_IDADE);
        return this;
        }
     public HomeRobot checkBtn(){
        checkIsClickable (VALIDARBTN);
        return this;
     }

     public HomeRobot checkBtnClicavel(){
        checkViewContainsText (BTN_IDADE);
        return this;
     }

    public HomeRobot DigitarIdade(){
        return enterTextIntoView(LABEL_IDADE, IDADE_DOG)
                .closeKeyboard();
    }

    public HomeRobot ClicarBotao(){
        clickOnView (VALIDARBTN);
        return this;

    }

    public HomeRobot ValidarResultado(){
        checkViewContainsText (TXT_HUMAN);
        return this;
    }

   public HomeRobot ValidadeIdade(){
        checkViewHasText (IDADE_HUMANA, "A idade do cachorro em anos humanos é: 84 Anos");
        return this;
   }

   public void IdadeVazia(){
        checkViewContainsText (IDADE_VAZIA);
        return;
   }
}





