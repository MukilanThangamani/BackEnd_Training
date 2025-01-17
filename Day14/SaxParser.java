import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParser extends DefaultHandler {
    public static void main(String[] args) {
        try{
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser fact = factory.newSAXParser();
            fact.parse(new File("src/xml"),new SaxParser());
        }catch(Exception e){}
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("start document:");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("end document:");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("start element:"+qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("end element:"+qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("characters in node :"+new String(ch,start,length));
    }
}
