package com.sitech;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

@Mojo(name="zdfplugin",defaultPhase = LifecyclePhase.PACKAGE)
public class ZhaodfMojo extends AbstractMojo {
    @Parameter
    private String msg;
    @Parameter
    private List<String> options;
    @Parameter(property = "args")
    private String args;
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("zdf,my first plugin!"+msg);
        System.out.println("zdf,my first plugin!"+options);
        System.out.println("zdf,my first plugin!"+args);
    }
}
