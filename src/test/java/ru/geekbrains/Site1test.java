package ru.geekbrains;

import config.testConfig;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Site1test extends testConfig {
    //проверка присутствия текста, проверка на наличие ошибок
    @Test
    public void site1() {
        //заходим на сайт
        driver.get(SITE_URL1);
        //находим и нажимаем кнопку "Курсы"
        WebElement enterButton = waitFiveSeconds.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@href=\"/courses\"]"))));
        enterButton.click();
        //находим и нажимаем карточку "Интегральный мир"
        WebElement integralWorldCard = waitFiveSeconds.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/div/div/div/div[1]/app-view-theme/div/div[2]/grid/div/div[2]/app-grid-card/app-course-card/div/div/a[2]"))));
        integralWorldCard.click();
        //проверяем наличие текста
        driver.getPageSource().contains("Алгоритмы машинного обучения требуют структурирования объемов данных," +
                " а вместе с тем подразумевают постоянное вмешательство человека в процесс обучения искусственного интеллекта." +
                " В противовес им сети глубокого обучения могут структурировать данные самостоятельно," +
                " учатся на своих ошибках и не требуют человеческого вмешательства." +
                " Механизмы глубокого обучения уже используются для распознавания речи," +
                " компьютерного зрения, создания изображений и звуков. В эпоху Big Data," +
                " когда количество данных стремительно растет каждый день," +
                " глубокое обучение — это ключ на пути к реальному искусственному интеллекту." +
                " При поддержке организаторов технологических конкурсов Up Great мы рассказываем о главных понятиях в области глубокого обучения.");
    }
}
