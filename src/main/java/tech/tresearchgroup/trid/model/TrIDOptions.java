package tech.tresearchgroup.trid.model;

import lombok.Data;
import picocli.CommandLine;

@Data
public class TrIDOptions {
    @CommandLine.Option(names = "-ae", description = "Add guessed extension to filename")
    private String ae;

    @CommandLine.Option(names = "-ce", description = "Change filename extension")
    private String ce;

    @CommandLine.Option(names = "-d", description = "Use the specified defs package")
    private String d;

    @CommandLine.Option(names = "-ns", description = "Disable unique strings check")
    private String ns;

    @CommandLine.Option(names = "-n", description = "Number of matches to show (default: 5)")
    private String n;

    @CommandLine.Option(names = "-@", description = "Read file list from stdin")
    private boolean at;

    @CommandLine.Option(names = "-v", description = "Verbose mode - display def name, author, etc.")
    private boolean v;

    @CommandLine.Option(names = "-w", description = "Wait for a key before exiting")
    private boolean w;

    @CommandLine.Option(names = "-?", description = "This help!")
    private boolean questionMark;
}
