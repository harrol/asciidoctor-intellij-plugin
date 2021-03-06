package org.asciidoc.intellij.actions.asciidoc;

/**
 * @author Erik Pragt
 */
public class MakeMono extends FormatAsciiDocAction {

  @Override
  public String updateSelection(String selection) {
    return "`" + selection +"`";
  }

  @Override
  public String getName() {
    return "MakeItalic";
  }


}
