package ua.edu.npu.task04;

public class FigureFactory {
    public TetrisFigure getFigure (Integer figureType) {
        if (figureType == null)
            return null;
        TetrisFigure fig = null;
        switch (figureType) {
            case 1:
                fig = new IFig();
                break;
            case 2:
                fig = new JFig();
                break;
            case 3:
                fig = new LFig();
                break;
            case 4:
                fig = new OFig();
                break;
            case 5:
                fig = new SFig();
                break;
            case 6:
                fig = new TFig();
                break;
            case 7:
                fig = new ZFig();
                break;
        }
        return fig;
    }
}
