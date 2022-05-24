import SearchQueryListener from "./parser/SearchQueryListener";
import searchContext from "./searchContext";

export default class TableGenerator extends SearchQueryListener {
  tableSource = "";

  exitSearchQuery(ctx) {
    console.log(ctx.parser.ruleNames);
    try {
      let lastParser = ctx.parser.ruleNames.at(-1);
      if (ctx[lastParser]()) {
        ctx.parser.ruleNames.slice(2).map((rule) => {
          if (ctx[rule]()) {
            this.tableSource += `
              <li class="list-group-item">
                <div class="row">
                <div class="col-3 text-primary">${rule}</div>
                <div class="col-9">${ctx[rule]().getText()}</div>
                </div>
              </li>
            `;
          }
        });
      }
    } catch (error) {
      searchContext.setError(error);
    }
  }

  getTable() {
    const table = `
            <ul class="list-group ">
                ${this.tableSource}
            </ul>
        `;
    return table;
  }
}
