package uip;

import net.serenitybdd.screenplay.targets.Target;

public class SportLinePromociones {
    public static final Target BTN_PROMOCIONES= Target.the("").locatedBy("//div[@class='top_links']/ul/li/a[@tabindex=\"0\" and @href=\"https://sportline.com.co/promociones/\"]");
    public static final Target BTN_PROM_ARTICULOS= Target.the("").locatedBy("//a/img [@class=\"pagebuilder-mobile-hidden\" and @alt=\"\" and @title=\"\" and @data-element=\"desktop_image\" and @data-pb-style=\"HCSJMQB\"]");
    public static final Target TXT_PROMOCION=Target.the("").locatedBy("(//div[@class=\"__featured_tag\"])[1]");
}
