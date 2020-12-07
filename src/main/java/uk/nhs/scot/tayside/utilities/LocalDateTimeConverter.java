package uk.nhs.scot.tayside.utilities;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@FacesConverter(value="localDateTimeConverter")
public class LocalDateTimeConverter implements Converter {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value)
    {
        LocalDateTime localDateTime = LocalDateTime.parse(value, formatter);
        return localDateTime;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value)
    {
        LocalDateTime datetime = (LocalDateTime)value;
        return datetime.format(formatter);
    }

}