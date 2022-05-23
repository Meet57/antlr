import SearchQueryListener from "./parser/SearchQueryListener";

export default class TableGenerator extends SearchQueryListener {
  tableSource = "";

  exitSearchQuery(ctx) {
    // const logType = ctx.logType().getText();
    const searchOperation = ctx.searchOperation().getText();
    const searchSource = ctx.searchSource().getText();
    const searchIP = ctx.searchIP().getText();
    const searchType = ctx.searchType().getText();
    const searchTask = ctx.searchTask().getText();

    this.tableSource += `
        <tr>
            <td>${searchOperation}</td>
            <td>${searchSource}</td>
            <td>${searchIP}</td>
            <td>${searchType}</td>
            <td>${searchTask}</td>
        <tr>
        `;
  }

  getTable() {
    const table = `
            <table class="table mt-5 table-hover">
                <tr class="table-dark">
                    <th>Operation</th>
                    <th>Source</th>
                    <th>IP</th>
                    <th>Type</th>
                    <th>Task</th>
                <tr>
                ${this.tableSource}
            </table>
        `;
    return table;
  }
}
