package ru.iteco.patterns.builder.classical;

/**
 * PdfClassicBuilder.
 *
 * @author Ilya_Sukhachev
 */
public class PdfClassicBuilder extends AbstractClassicBuilder {

    @Override
    public AbstractClassicBuilder setFileName(String name) {
        this.name = name + ".pdf";
        return this;
    }

}
