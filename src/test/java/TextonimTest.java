import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class TextonimTest {


    static Textonim textonim = new Textonim();

    @Test
    public void shouldCheckMethodReturnTrueForLineAlaAndPattern252() throws Exception {
        //given
        textonim.fillMap();

        //when
        boolean value = textonim.check("ala", "252");

        //then
        Assertions.assertThat(value).isTrue();
    }

    @Test
    public void shouldCheckMethodReturnFalseForLineAlaAndPattern262() throws Exception {
        //given
        textonim.fillMap();
        //when
        boolean value = textonim.check("ala", "262");
        //then
        Assertions.assertThat(value).isFalse();
    }

    @Test
    public void shouldCheckMethodReturnFalseForLineAlaAndPattern2522() throws Exception {
        //given
        textonim.fillMap();
        //when
        boolean value = textonim.check("ala", "2522");
        //then
        Assertions.assertThat(value).isFalse();
    }

    @Test
    public void shouldCheckMethodReturnFalseForLineLegnacaAndPattern534622() throws Exception {
        //given
        textonim.fillMap();
        //when
        boolean value = textonim.check("lęgnąca", "5346222");
        //then
        Assertions.assertThat(value).isTrue();
    }

    @Test
    public void shouldFillMapHasSize69() throws Exception {
        //given
        textonim.fillMap();
        //when
        Map<String, String> map = textonim.getMAP();
        int mapSize = map.size();
        //then
        Assertions.assertThat(mapSize).isEqualTo(69);
    }

    @Test
    public void shouldReadFileMethodReturnListSize1() throws Exception {
        //given
        Textonim textonim = new Textonim();
        List<String> readFileList = textonim.getResultList();
        textonim.fillMap();
        //when
        textonim.readFile("534625297");
        int readFileListSize = readFileList.size();
        //then
        Assertions.assertThat(readFileListSize).isEqualTo(1);
    }

    @Test
    public void shouldReadFileMethodReturnListSize3762() throws Exception {
        //given
        Textonim textonim = new Textonim();
        List<String> readFileList = textonim.getResultList();
        textonim.fillMap();
        //when
        textonim.readFile("264");
        int readFileListSize = readFileList.size();
        //then
        Assertions.assertThat(readFileListSize).isEqualTo(3762);
    }

}