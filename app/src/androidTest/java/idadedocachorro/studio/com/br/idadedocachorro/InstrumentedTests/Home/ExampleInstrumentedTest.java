package idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import idadedocachorro.studio.com.br.idadedocachorro.InstrumentedTests.Home.robots.HomeRobot;
import idadedocachorro.studio.com.br.idadedocachorro.MainActivity;
import idadedocachorro.studio.com.br.idadedocachorro.common.ScreenRobot;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
//@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends ScreenRobot {

    @Rule
    public ActivityTestRule<MainActivity>
            mainActivityActivityTestRule = new ActivityTestRule<> (MainActivity.class, false, true);


    @Before
    public void Test() {

    }

    @Test
    public void EncontrarElementos() {
        new HomeRobot ()
                .checkImgDisplayed ()
                .checkLabel ()
                .checkBtnClicavel ();

    }

    @Test
    public void ValidarTexto(){
        new HomeRobot ()
                .checkHeader ()
                .checkTxt ()
                .checkBtn ();

    }

    @Test
    public void ValidarIdade() {
        new HomeRobot ()
                .DigitarIdade ()
                .ClicarBotao()
                .ValidarResultado()
                .ValidadeIdade();

    }

    @Test
    public void TesteNegativo(){
        new HomeRobot ()
                .checkImgDisplayed ()
                .checkHeader ()
                .checkTxt ()
                .checkLabel ()
                .checkBtn ()
                .checkBtnClicavel ()
                .ClicarBotao ()
                .IdadeVazia();

    }
}


