package org.asciidoc.intellij.actions.asciidoc;

/**
 * @author Erik Pragt
 */
public class MakeItalic extends FormatAsciiDocAction {

  @Override
  public String updateSelection(String selection) {
    return "_" + selection +"_";
  }

  @Override
  public String getName() {
    return "MakeItalic";
  }


}
