package com.example.samochodyfabryka.fabryka;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyChangeSupport;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.util.Currency;


@Component
public class TypPojazduConverter extends PropertyEditorSupport {
//    @Override
//    public void setValue(Object value) {
//        super.setValue(value);
//    }
//
//    @Override
//    public void setAsText(String text) throws IllegalArgumentException {
//       String testWartosc = text.toUpperCase();
//       TypPojazduENUM typPojazduENUM = TypPojazduENUM.valueOf(testWartosc);
//        setValue(typPojazduENUM);
//    }

//        @InitBinder
//    public void initBinder(WebDataBinder dataBinder) {
//        dataBinder.registerCustomEditor(TypPojazduENUM.class, new TypPojazduConverter());
//    }

}
