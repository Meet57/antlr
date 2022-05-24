class searchContext {
  _htmlData = null;
  _error = null;

  getHtmlData() {
    return this._htmlData;
  }

  setHtmlData(data) {
    this._htmlData = data;
  }

  getError() {
    return this._error;
  }

  setError(data) {
    this._error = data;
  }
}

const SearchContext = new searchContext();

export default SearchContext;
