
package com.kendoui.taglib.chart;

import com.kendoui.taglib.BaseTag;

import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class TitleTag extends BaseTag /* interfaces */implements Border/* interfaces */ {

    
    @Override
    public int doEndTag() throws JspException {
//>> doEndTag

        Title parent = (Title)findParentWithClass(Title.class);

        parent.setTitle(this);

//<< doEndTag

        return super.doEndTag();
    }

    @Override
    public void initialize() {
//>> initialize
//<< initialize

        super.initialize();
    }

    @Override
    public void destroy() {
//>> destroy
//<< destroy

        super.destroy();
    }

//>> Attributes

    @Override
    public void setBorder(BorderTag value) {
        setProperty("border", value.properties());
    }

    public String getBackground() {
        return (String)getProperty("background");
    }

    public void setBackground(String value) {
        setProperty("background", value);
    }

    public String getColor() {
        return (String)getProperty("color");
    }

    public void setColor(String value) {
        setProperty("color", value);
    }

    public String getFont() {
        return (String)getProperty("font");
    }

    public void setFont(String value) {
        setProperty("font", value);
    }

    public int getMargin() {
        return (int)getProperty("margin");
    }

    public void setMargin(int value) {
        setProperty("margin", value);
    }

    public int getPadding() {
        return (int)getProperty("padding");
    }

    public void setPadding(int value) {
        setProperty("padding", value);
    }

    public String getPosition() {
        return (String)getProperty("position");
    }

    public void setPosition(String value) {
        setProperty("position", value);
    }

    public int getRotation() {
        return (int)getProperty("rotation");
    }

    public void setRotation(int value) {
        setProperty("rotation", value);
    }

    public String getText() {
        return (String)getProperty("text");
    }

    public void setText(String value) {
        setProperty("text", value);
    }

    public boolean getVisible() {
        return (boolean)getProperty("visible");
    }

    public void setVisible(boolean value) {
        setProperty("visible", value);
    }

//<< Attributes

}
