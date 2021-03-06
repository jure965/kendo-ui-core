---
title: Overview
page_title: LinearGauge Overview | Telerik UI for ASP.NET MVC HTML Helpers
description: "Learn the basics when working with the Telerik UI LinearGauge HtmlHelper for ASP.NET MVC."
slug: overview_lineargaugehelper_aspnetmvc
position: 1
---

# LinearGauge HtmlHelper Overview

The Telerik UI LinearGauge HtmlHelper for ASP.NET MVC is a server-side wrapper for the Kendo UI LinearGauge widget.

The LinearGauge represents values on a linear scale.

* [Demo page for the LinearGauge](https://demos.telerik.com/aspnet-mvc/linear-gauge)

## Basic Configuration

1. Make sure you followed all the steps from the [introductory article on Telerik UI for ASP.NET MVC]({% slug overview_aspnetmvc %}).
1. Create a new action method which renders the view.

        public ActionResult Index()
        {
            return View();
        }

1. Add a LinearGauge.

    ```ASPX
        <%: Html.Kendo().LinearGauge()
            .Name("linearGauge") // The name of the LinearGauge is mandatory. It specifies the "id" attribute of the LinearGauge.
            .Scale(scale => scale
                .Min(0) // Set the min value of the LinearGauge.
                .Max(200) // Set the min value of the LinearGauge.
            )
            .Pointer(pointer => pointer
                .Value(10) // Set the value of the LinearGauge.
            )
        %>
    ```
    ```Razor
        @(Html.Kendo().LinearGauge()
            .Name("linearGauge") // The name of the LinearGauge is mandatory. It specifies the "id" attribute of the LinearGauge.
            .Scale(scale => scale
                .Min(0) // Set the min value of the LinearGauge.
                .Max(200) // Set the min value of the LinearGauge.
            )
            .Pointer(pointer => pointer
                .Value(10) // Set the value of the LinearGauge.
            )
        )
    ```

## Referencing Existing Instances

To reference an existing LinearGauge instance, use the [`jQuery.data()`](http://api.jquery.com/jQuery.data/) configuration option. Once a reference is established, use the [LinearGauge client-side API](http://docs.telerik.com/kendo-ui/api/javascript/dataviz/ui/lineargauge#methods) to control its behavior.

    // Place the following after the LinearGauge for ASP.NET MVC declaration.
    <script>
        $(function() {
            // The Name() of the LinearGauge is used to get its client-side instance.
            var gauge = $("#linearGauge").data("kendoLinearGauge");
        });
    </script>

## See Also

* [Basic Usage of the LinearGauge HtmlHelper for ASP.NET MVC (Demo)](https://demos.telerik.com/aspnet-mvc/linear-gauge)
* [LinearGaugeBuilder Server-Side API](http://docs.telerik.com/aspnet-mvc/api/Kendo.Mvc.UI.Fluent/LinearGaugeBuilder)
* [LinearGauge Server-Side API](/api/lineargauge)
