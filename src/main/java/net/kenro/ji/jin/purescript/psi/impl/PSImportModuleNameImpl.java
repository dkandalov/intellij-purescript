package net.kenro.ji.jin.purescript.psi.impl;

import com.intellij.lang.ASTNode;
import net.kenro.ji.jin.purescript.psi.PSImportModuleName;

public class PSImportModuleNameImpl extends PSPsiElement implements PSImportModuleName {

    public PSImportModuleNameImpl(final ASTNode node) {
        super(node);
    }

}
