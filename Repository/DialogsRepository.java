package Repository;

import java.util.ArrayList;


import Dialog.IDialog;
import Dialog.CircleDialog;
import Dialog.RectangleDialog;
import Dialog.SquareDialog;
import Dialog.TriangleDialog;

public class DialogsRepository extends Repository<IDialog> {

    public DialogsRepository(ArrayList<IDialog> figures) {
        super(figures);
    }

    

}
